/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.conformance.ffdc;

/**
 * Conformance exception provides a base class for exceptions that indicate there is a failure in the
 * conformance tests.
 */
public class ConformanceException extends Exception
{
    /**
     * Normal constructor for a conformance exception
     *
     * @param errorMessage description of the exception
     */
    public ConformanceException(String   errorMessage)
    {
        super(errorMessage);
    }
}
