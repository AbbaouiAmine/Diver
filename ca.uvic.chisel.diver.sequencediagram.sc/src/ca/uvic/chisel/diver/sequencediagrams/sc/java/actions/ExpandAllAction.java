/*******************************************************************************
 * Copyright 2005-2007, CHISEL Group, University of Victoria, Victoria, BC, Canada.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     The Chisel Group, University of Victoria
 *******************************************************************************/
package ca.uvic.chisel.diver.sequencediagrams.sc.java.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.zest.custom.uml.viewers.UMLSequenceViewer;

/**
 * Expands the activations in the viewer starting at the focused root.
 * @author Del Myers
 */

public class ExpandAllAction extends Action {
	
	private UMLSequenceViewer viewer;
	private Object element;
	
	public ExpandAllAction(UMLSequenceViewer viewer) {
		this.viewer = viewer;
	}
	
	@Override
	public void run() {
		if (element != null) {
			viewer.expandActivationsUnder(element, true);
		}
	}
	
	/**
	 * @param element
	 */
	public void setFocusElement(Object element) {
		this.element = element;
	}

}
