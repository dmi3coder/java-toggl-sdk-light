package io.github.dmitrychaban.java_toggl_sdk_light;

import io.github.dmitrychaban.java_toggl_sdk_light.model.Report;
import io.github.dmitrychaban.java_toggl_sdk_light.model.UserContext;
import io.github.dmitrychaban.java_toggl_sdk_light.model.Workspace;
import org.joda.time.DateTime;
import reactor.core.publisher.Mono;

public interface TogglApi {
    Mono<UserContext> getContext();

    void setContext(Mono<UserContext> context);

    Workspace getCurrentWorkspace();

    void setCurrentWorkspace(Workspace currentWorkspace);

    Mono<Report> getWeekReport(DateTime anyDayOfWeek);

    Mono<Report> getDayReport(DateTime day);
}
