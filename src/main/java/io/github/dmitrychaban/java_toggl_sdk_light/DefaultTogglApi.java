package io.github.dmitrychaban.java_toggl_sdk_light;


import io.github.dmitrychaban.java_toggl_sdk_light.model.UserContext;
import io.github.dmitrychaban.java_toggl_sdk_light.model.Workspace;
import reactor.core.publisher.Mono;

public class DefaultTogglApi implements TogglApi {
    private Mono<UserContext> context;
    private Workspace currentWorkspace;

    public DefaultTogglApi(Mono<UserContext> context) {
        this.context = context;
    }

    @Override
    public Mono<UserContext> getContext() {
        return context;
    }

    @Override
    public void setContext(Mono<UserContext> context) {
        this.context = context;
    }

    @Override
    public Workspace getCurrentWorkspace() {
        return currentWorkspace;
    }

    @Override
    public void setCurrentWorkspace(Workspace currentWorkspace) {
        this.currentWorkspace = currentWorkspace;
    }

}
