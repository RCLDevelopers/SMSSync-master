/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package org.addhen.smssync.domain.entity;

import org.addhen.smssync.BaseRobolectricTestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Ushahidi Team <team@ushahidi.com>
 */
public class LogEntityTest extends BaseRobolectricTestCase {

    private LogEntity mLogEntity;

    @Before
    public void setUp() {
        mLogEntity = DomainEntityFixture.getLogEntity();
    }

    @Test
    public void shouldSetLogEntity() {
        assertNotNull(mLogEntity);
        assertNotNull(mLogEntity._id);
        assertEquals(DomainEntityFixture.getLogEntity().getId(), mLogEntity.getId());
        assertEquals(DomainEntityFixture.getLogEntity().getMessage(), mLogEntity.getMessage());
    }
}
