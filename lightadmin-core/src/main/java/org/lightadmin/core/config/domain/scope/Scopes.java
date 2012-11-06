package org.lightadmin.core.config.domain.scope;

import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import static com.google.common.collect.Lists.newLinkedList;

public class Scopes implements Iterable<Scope>, Serializable {

	private final List<Scope> scopes;

	Scopes( final List<Scope> scopes ) {
		Assert.notNull( scopes );
		this.scopes = newLinkedList( scopes );
	}

	@Override
	public Iterator<Scope> iterator() {
		return scopes.iterator();
	}

	public Scope getScope( String name ) {
		for ( Scope scope : scopes ) {
			if ( scope.getName().equalsIgnoreCase( name ) ) {
				return scope;
			}
		}
		return null;
	}
}