/*
 * Copyright 2014-2019 Logo Business Solutions
 * (a.k.a. LOGO YAZILIM SAN. VE TIC. A.S)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.lbs.tedam.model.DTO;

import java.util.ArrayList;
import java.util.List;

public class JobXMLTestSuitesReportDTO {

    private int jobId = 0;

    private List<JobXMLTestSuiteReportDTO> jobXMLTestSuiteReportModelList = new ArrayList<>();

    /**
     * @return the jobId
     */
    public int getJobId() {
        return jobId;
    }

    /**
     * @param jobId the jobId to set
     */
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    /**
     * @return the jobXMLTestSuiteReportModelList
     */
    public List<JobXMLTestSuiteReportDTO> getJobXMLTestSuiteReportModelList() {
        return jobXMLTestSuiteReportModelList;
    }

    /**
     * @param jobXMLTestSuiteReportModelList the jobXMLTestSuiteReportModelList to set
     */
    public void setJobXMLTestSuiteReportModelList(List<JobXMLTestSuiteReportDTO> jobXMLTestSuiteReportModelList) {
        this.jobXMLTestSuiteReportModelList = jobXMLTestSuiteReportModelList;
    }

}
