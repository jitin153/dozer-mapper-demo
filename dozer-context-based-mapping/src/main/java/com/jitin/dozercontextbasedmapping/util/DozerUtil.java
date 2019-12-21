package com.jitin.dozercontextbasedmapping.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dozerUtil")
public class DozerUtil {

	@Autowired
	private Mapper mapper;

	public void map(Object source, Object destination) {
		mapper.map(source, destination);
	}

	public <T, S> List<T> mapAsList(List<S> objects, Class<T> newObjectClass) {
		final List<T> newObjects = new ArrayList<T>();
		for (S s : objects) {
			newObjects.add(mapper.map(s, newObjectClass));
		}
		return newObjects;
	}

	/*
	 * Context Based Mapping Suppose you have a student DTO and inside that you
	 * have Address DTO. This student DTO is being used at more than one place & in some
	 * cases you want to exclude address. To achieve this you have to call below
	 * method with mapId. Configuration is in dozerMapping.xml file.
	 */
	public <T, S> List<T> mapAsList(List<S> objects, Class<T> newObjectClass, String mapId) {
		final List<T> newObjects = new ArrayList<T>();
		for (S s : objects) {
			newObjects.add(mapper.map(s, newObjectClass, mapId));
		}
		return newObjects;
	}
}
