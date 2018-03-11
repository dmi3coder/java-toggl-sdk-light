package io.github.dmitrychaban.java_toggl_sdk_light;


import io.github.dmitrychaban.java_toggl_sdk_light.model.Report;
import io.github.dmitrychaban.java_toggl_sdk_light.model.UserContext;
import io.github.dmitrychaban.java_toggl_sdk_light.model.Workspace;
import io.github.dmitrychaban.java_toggl_sdk_light.model.remote.ResponseWrapper;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

import java.util.Base64;
import java.util.function.Consumer;

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

    @Override
    public Mono<Report> getWeekReport(DateTime anyDayOfWeek) {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        WebClient client = WebClient.create("https://toggl.com/reports/api/v2");
        String headerTokenValue = context.block().getApiToken() + ":api_token";
        String encodedHeaderTokenValue = new String(Base64.getEncoder().encode(headerTokenValue.getBytes()));
        DateTime startDayOfWeek = anyDayOfWeek.withDayOfWeek(DateTimeConstants.MONDAY);
        DateTime endDayOfWeek = anyDayOfWeek.withDayOfWeek(DateTimeConstants.SUNDAY);
        return client.get()
                .uri("/details?workspace_id={workspaceId}&since={sinceDate}&until={untilDate}&user_agent=api_test",
                        currentWorkspace.getId(),
                        dtf.print(startDayOfWeek),
                        dtf.print(endDayOfWeek))
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "Basic " + encodedHeaderTokenValue)
                .retrieve()
                .bodyToMono(Report.class);
    }

    @Override
    public Mono<Report> getDayReport(DateTime day) {
        return null;
    }
}
