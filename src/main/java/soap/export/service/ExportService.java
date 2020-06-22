package soap.export.service;

import soap.export.dto.PersonDto;

/**
 * Created by ZhangPY on 2020/6/23
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public interface ExportService {

    /**
     * 请求导出,并生成文件,返回导出结果
     * @param personDto
     * @return
     */
    String getPersonExport(PersonDto personDto);
}
