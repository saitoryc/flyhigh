package com.saitoryc.flyhigh.controller;

import com.saitoryc.flyhigh.domain.model.Sample;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.MigrationInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by UU051681 on 2017/08/21.
 */
@Controller
@RequestMapping("/sample")
public class SampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "これはサンプルページです";
    }

    @RequestMapping("/thymeleaf-sample")
    public String sample(Model model) {
        try {
            Flyway flyway = new Flyway();
            flyway.setDataSource("aaaa", "flywaysample", "Test!1234");
            flyway.setLocations("filesystem:F:\\99_tmp\\20170821\\flyway-commandline-4.2.0-windows-x64\\flyway-4.2.0\\sql");
            MigrationInfoService infoService = flyway.info();
            MigrationInfo info = infoService.current();

            LOGGER.info(info.toString());

            model.addAttribute("checksum", info.getChecksum());
            model.addAttribute("description", info.getDescription());
            model.addAttribute("executionTime", info.getExecutionTime());
            model.addAttribute("installedBy", info.getInstalledBy());
            model.addAttribute("installedOn", info.getInstalledOn());
            model.addAttribute("installedRank", info.getInstalledRank());
            model.addAttribute("script", info.getScript());
            model.addAttribute("state", info.getState().getDisplayName());
            model.addAttribute("type", info.getType().name());
            model.addAttribute("version", info.getVersion().getVersion());
        } catch (Exception e) {
            LOGGER.error(e.getLocalizedMessage());
        }
        return "sample";
    }
}
