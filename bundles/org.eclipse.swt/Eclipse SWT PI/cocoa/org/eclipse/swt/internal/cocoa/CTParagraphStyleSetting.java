/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.swt.internal.cocoa;

public class CTParagraphStyleSetting {
	/** @field cast=(CTParagraphStyleSpecifier) */
	public int spec;
	public long /*int*/ valueSize;
	/** @field cast=(void *) */
	public long /*int*/ value;
	public static final int sizeof = OS.CTParagraphStyleSetting_sizeof();
}