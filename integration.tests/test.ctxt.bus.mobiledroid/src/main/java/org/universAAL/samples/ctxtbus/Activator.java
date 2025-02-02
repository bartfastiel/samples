/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion
	Avanzadas - Grupo Tecnologias para la Salud y el
	Bienestar (TSB)

	See the NOTICE file distributed with this work for additional
	information regarding copyright ownership

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
package org.universAAL.samples.ctxtbus;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.osgi.OSGiContainer;

public class Activator implements BundleActivator {
	public static BundleContext context = null;
	public static CPublisher cpublisher = null;
	private static ModuleContext moduleContext = null;

	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		Activator.moduleContext = OSGiContainer.THE_CONTAINER.registerModule(new Object[] { context });
		cpublisher = new CPublisher(moduleContext);
		cpublisher.sendUniqueBurst(100);
	}

	public void stop(BundleContext arg0) throws Exception {
		cpublisher.close();
	}

}
