/*
 * Copyright (C) 2018 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.engineering.srcclr.internal;

import com.redhat.engineering.srcclr.SrcClrWrapper;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThresholdTest
{
    @Rule
	public final SystemErrRule systemRule = new SystemErrRule().enableLog().muteForSuccessfulTests();

    @Test
    public void invalidThreshold1Test() throws Exception
    {
        SrcClrWrapper.main( new String [] { "scm", "-t", "-1" } );

        assertTrue( systemRule.getLog().contains( "Invalid CVSS Score parameter" ) );
    }

    @Test
    public void invalidThreshold2Test() throws Exception
    {
        SrcClrWrapper.main( new String [] { "scm", "-t", "11" } );

        assertTrue( systemRule.getLog().contains( "Invalid CVSS Score parameter" ) );
    }
}