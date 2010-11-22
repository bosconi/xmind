/* ******************************************************************************
 * Copyright (c) 2006-2010 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.gef.service;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;

public interface IShadowService extends IViewerService {

    IFigure getLayer();

    void setLayer(IFigure layer);

    Dimension getDefaultOffset();

    void setDefaultOffset(Dimension offset);

    int getDefaultAlpha();

    void setDefaultAlpha(int alpha);

    void addShadow(IFigure source);

    void addShadow(IFigure source, int alpha);

    void addShadow(IFigure source, Dimension offset);

    void addShadow(IFigure source, int alpha, Dimension offset);

    void removeShadow(IFigure source);

}