package com.example.PeregrinosFX.controller;

import com.example.PeregrinosFX.config.StageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class ExportarCarnetController {

    @Lazy
    @Autowired
    private StageManager stageManager;
}
