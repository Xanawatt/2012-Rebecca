/**
 * Copyright (c) 2012 Precise Path Robotics, Inc
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Luke Shumaker <lukeshu@sbcglobal.net>
 */
package org.mckenzierobotics.y2012.lib;

import edu.wpi.first.wpilibj.AnalogChannel;

/**
 * TODO
 * @author Luke Shumaker <lukeshu@sbcglobal.net>
 */
public class TemperatureSensor extends AnalogChannel {
	public TemperatureSensor(int moduleNumber, int channel) {
		super(moduleNumber, channel);
	}
	public TemperatureSensor(int channel) {
		super(channel);
	}
}
