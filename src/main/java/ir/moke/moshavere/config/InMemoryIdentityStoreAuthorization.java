package ir.moke.moshavere.config;

import ir.moke.moshavere.model.entity.Role;
import ir.moke.moshavere.model.repository.RoleRepository;
import ir.moke.moshavere.model.service.RoleService;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStore;
import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Collectors;

import static javax.security.enterprise.identitystore.IdentityStore.ValidationType.PROVIDE_GROUPS;

@ApplicationScoped
public class InMemoryIdentityStoreAuthorization implements IdentityStore {

    @EJB
    private RoleService service;

    @Override
    public int priority() {
        return 80;
    }

    @Override
    public Set<ValidationType> validationTypes() {
        return EnumSet.of(PROVIDE_GROUPS);
    }

    @Override
    public Set<String> getCallerGroups(CredentialValidationResult validationResult) {
        String username = validationResult.getCallerPrincipal().getName();
        return service.select(username).stream().map(Role::getName).collect(Collectors.toSet());
    }
}
