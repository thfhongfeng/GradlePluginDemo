package com.pine.gradle.task;

import com.pine.gradle.extension.PersonConfig;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by tanghongfeng on 2018/7/2.
 */

public class PrintTask extends DefaultTask {
    @TaskAction
    public void doAction() {
        PersonConfig personConfig = (PersonConfig) getProject().getExtensions().getByName("personExt");
        System.out.println("PrintTask: print person");
        System.out.println("  name " + personConfig.getName());
        System.out.println("  age " + personConfig.getAge());
        System.out.println("  sex " + (personConfig.isBoy() ? "boy" : "girl"));
    }
}
