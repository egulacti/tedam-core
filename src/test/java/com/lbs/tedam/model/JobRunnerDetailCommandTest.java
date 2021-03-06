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

package com.lbs.tedam.model;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lbs.tedam.data.config.DataConfig;
import com.lbs.tedam.data.service.TestDataConfig;
import com.lbs.tedam.test.BaseServiceTest;
import com.lbs.tedam.util.EnumsV2.CommandStatus;
import com.lbs.tedam.util.EnumsV2.ExecutionStatus;
import com.lbs.tedam.util.EnumsV2.RunOrder;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestDataConfig.class, DataConfig.class})
public class JobRunnerDetailCommandTest extends BaseServiceTest {

    @Test
    public void testSetters() {
        JobRunnerDetailCommand jobRunnerDetailCommand = new JobRunnerDetailCommand();
        jobRunnerDetailCommand.setJobCommandId(1);
        jobRunnerDetailCommand.setCommandStatus(CommandStatus.COMPLETED);
        jobRunnerDetailCommand.setDraftCommandName("");
        jobRunnerDetailCommand.setFirstExpectedResult("");
        jobRunnerDetailCommand.setLastExpectedResult("");
        jobRunnerDetailCommand.setRunOrder(RunOrder.RUN_SCRIPT);
        jobRunnerDetailCommand.setWindowsCommand("");
        jobRunnerDetailCommand.setUnixCommand("");
        jobRunnerDetailCommand.setExecutionStatus(ExecutionStatus.CAUTION);
        jobRunnerDetailCommand.setTestCaseId(1);
        jobRunnerDetailCommand.setTestResultList(new ArrayList<>());
		jobRunnerDetailCommand.setJobCommandId(Integer.valueOf(1));
    }

    @Test
    public void testGetters() {
        JobRunnerDetailCommand jobRunnerDetailCommand = new JobRunnerDetailCommand();
        jobRunnerDetailCommand.getJobCommandId();
        jobRunnerDetailCommand.getCommandStatus();
        jobRunnerDetailCommand.getDraftCommandName();
        jobRunnerDetailCommand.getFirstExpectedResult();
        jobRunnerDetailCommand.getLastExpectedResult();
        jobRunnerDetailCommand.getRunOrder();
        jobRunnerDetailCommand.getWindowsCommand();
        jobRunnerDetailCommand.getUnixCommand();
        jobRunnerDetailCommand.getExecutionStatus();
        jobRunnerDetailCommand.getTestCaseId();
        jobRunnerDetailCommand.getTestResultList();
		jobRunnerDetailCommand.getJobGroupId();
    }

}
