package soap.export.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soap.export.dto.PersonDto;
import soap.export.service.ExportService;
import soap.export.service.fegin.ExportServiceFegin;

/**
 * Created by ZhangPY on 2020/6/23
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@Service
public class ExportServiceImpl implements ExportService {

    @Autowired
    private ExportServiceFegin exportServiceFegin;

    @Override
    public String getPersonExport(PersonDto personDto) {
        String personListForExport = exportServiceFegin.getPersonListForExport(personDto);
        return personListForExport;
    }
}
