package org.clinicalontology.common.graph;


public interface CommandInterface<T> {
	public void execute(Node<T> node);
}
