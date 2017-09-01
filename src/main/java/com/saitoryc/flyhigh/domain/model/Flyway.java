package com.saitoryc.flyhigh.domain.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by UU051681 on 2017/08/28.
 */
public class Flyway implements Serializable {
    private String id;
    @NotNull
    private String user_id;
    @NotNull
    private String name;
    @NotNull
    private String type;
    @NotNull
    private String url;
    @NotNull
    private String userName;
    private String password;

    private String migratePath;

    private String gitOAuthToken;
    @NotNull
    private String gitRepositoryUrl;

}
