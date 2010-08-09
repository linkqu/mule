/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.api.routing;

import org.mule.api.MessagingException;
import org.mule.api.MuleMessage;

/**
 * Enables an artifact to be matched for routing before actually routing to it
 */
public interface Matchable
{

    /**
     * Determines if the event should be processed
     * 
     * @param event the current event to evaluate
     * @return true if the event should be processed by this router
     * @throws MessagingException if the event cannot be evaluated
     */
    boolean isMatch(MuleMessage message) throws MessagingException;

}
