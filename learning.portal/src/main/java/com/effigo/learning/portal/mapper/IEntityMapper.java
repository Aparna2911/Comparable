package com.effigo.learning.portal.mapper;

import java.util.List;

public interface IEntityMapper<D, E> {
	E toEntity(D dto);

	D toDto(E e);

	List<D> toDto(List<E> e);

	List<E> toEntity(List<D> d);

}
