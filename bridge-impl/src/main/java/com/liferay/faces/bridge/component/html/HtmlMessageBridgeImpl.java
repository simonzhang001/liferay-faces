/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.bridge.component.html;

import java.util.Map;

import javax.faces.component.html.HtmlMessage;


/**
 * @author  Neil Griffin
 */
public class HtmlMessageBridgeImpl extends HtmlMessage {

	// Private Data Members
	private Map<String, Object> attributes;

	@Override
	public Map<String, Object> getAttributes() {

		if (attributes == null) {
			attributes = new MessageAttributes(super.getAttributes());
		}

		return attributes;
	}
}
