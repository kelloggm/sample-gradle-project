package sample.gradle.project;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Pojo {
    private @NonNull String foo;
}
