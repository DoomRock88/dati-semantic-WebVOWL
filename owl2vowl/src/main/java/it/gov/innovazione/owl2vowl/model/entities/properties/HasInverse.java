package it.gov.innovazione.owl2vowl.model.entities.properties;

import org.semanticweb.owlapi.model.IRI;

/**
 * @author Eduard
 */
public interface HasInverse {
	void addInverse(IRI iri);

	// TODO could be multiple inverses?
	IRI getInverse();
}
