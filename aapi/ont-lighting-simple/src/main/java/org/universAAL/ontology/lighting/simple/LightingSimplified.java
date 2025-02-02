/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung

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

package org.universAAL.ontology.lighting.simple;

import org.universAAL.middleware.service.owl.Service;

/**
 * Ontological service that handles light sources.
 *
 * @author mtazari
 * @author mpsiuk
 *
 */
public class LightingSimplified extends Service {
	public static final String MY_URI = LightingOntologySimplified.NAMESPACE + "Lighting";

	public LightingSimplified() {
		super();
	}

	public LightingSimplified(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

}
