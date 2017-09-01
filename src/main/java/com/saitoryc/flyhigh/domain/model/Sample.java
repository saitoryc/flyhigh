package com.saitoryc.flyhigh.domain.model;

import java.io.Serializable;

/**
 * Created by UU051681 on 2017/08/21.
 */
public class Sample implements Serializable {

    private static final long serialVersionUID = 1L;

    private String checksum;
    private String description;
    private String executionTime;
    private String installedBy;
    private String installedOn;
    private String installedRank;
    private String script;
    private String state;
    private String type;
    private String version;

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public String getInstalledBy() {
        return installedBy;
    }

    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    public String getInstalledOn() {
        return installedOn;
    }

    public void setInstalledOn(String installedOn) {
        this.installedOn = installedOn;
    }

    public String getInstalledRank() {
        return installedRank;
    }

    public void setInstalledRank(String installedRank) {
        this.installedRank = installedRank;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
