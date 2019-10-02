/**
 * Copyright 2014 ArcBees Inc.
 *
 * This file is part of Stash TeamCity plugin.
 *
 * Stash TeamCity plugin is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * Stash TeamCity plugin is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with Stash TeamCity plugin. If not,
 * see http://www.gnu.org/licenses/.
 */

package com.arcbees.vcs.stash.model;

import com.arcbees.vcs.model.Branch;
import com.arcbees.vcs.model.Commit;
import com.arcbees.vcs.model.PullRequestTarget;

public class StashPullRequestTarget implements PullRequestTarget<StashCommit, StashBranch> {
    private StashCommit commit;
    private StashBranch branch;
    private String latestCommit;
    private String displayId;

    @Override
    public Commit getCommit() {
        if (commit == null) {
            setCommit(new StashCommit(latestCommit));
        }
        return commit;
    }

    @Override
    public void setCommit(StashCommit commit) {
        this.commit = commit;
    }

    @Override
    public Branch getBranch() {
        if (branch == null) {
            setBranch(new StashBranch(displayId));
        }
        return branch;
    }

    @Override
    public void setBranch(StashBranch branch) {
        this.branch = branch;
    }
}
