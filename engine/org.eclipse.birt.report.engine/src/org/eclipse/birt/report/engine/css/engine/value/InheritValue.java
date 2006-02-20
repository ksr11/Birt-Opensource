/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Apache - initial API and implementation
 *  Actuate Corporation - changed by Actuate
 *******************************************************************************/
/*

   Copyright 1999-2003  The Apache Software Foundation 

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.eclipse.birt.report.engine.css.engine.value;

import org.w3c.dom.css.CSSValue;

/**
 * This singleton class represents the 'inherit' value.
 * 
 * @version $Id: InheritValue.java,v 1.2 2005/11/22 09:59:57 wyan Exp $
 */
public class InheritValue extends Value
{

	/**
	 * The only instance of this class.
	 */
	public final static InheritValue INSTANCE = new InheritValue( );

	/**
	 * Creates a new InheritValue object.
	 */
	protected InheritValue( )
	{
	}

	/**
	 * A string representation of the current value.
	 */
	public String getCssText( )
	{
		return "inherit";
	}

	/**
	 * A code defining the type of the value.
	 */
	public short getCssValueType( )
	{
		return CSSValue.CSS_INHERIT;
	}

	/**
	 * Returns a printable representation of this object.
	 */
	public String toString( )
	{
		return getCssText( );
	}
}
