package soap.export.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import soap.export.dto.PersonDto;
import soap.export.service.ExportService;
import soap.export.service.fegin.ExportServiceFegin;

/**
 * Created by ZhangPY on 2020/6/23
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@Controller
@RequestMapping(value = "/export")
public class ExportController {

    @Autowired
    private ExportService exportService;

    @PostMapping(value = "/person")
    public String getPersonExport(PersonDto personDto) {
        return exportService.getPersonExport(personDto);
    }
}
