/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.training.election.domain;

import java.util.List;


public class Election {

    public static final String GOOD_CANDIDATE = "Good candidate";
    public static final String BAD_CANDIDATE = "Bad candidate";

    private List<FederalState> federalStateList;


    private Election() {
    }

    public Election(List<FederalState> federalStateList) {
        this.federalStateList = federalStateList;
    }

    public List<FederalState> getFederalStateList() {
        return federalStateList;
    }

    public String[] createCandidates() {
        return new String[] {GOOD_CANDIDATE, BAD_CANDIDATE};
    }

}
