package com.sandeep.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.sandeep.ws.model.Data;
import com.sandeep.ws.model.Output;
import com.sandeep.ws.model.RestructureList;
import com.sandeep.ws.services.DataService;

@Service
public class DataServiceImpl implements DataService {

	@Override
	public Iterable findAll() {

		Iterable<Data> dbList = RestructureList.createlist();
		Map<Integer, Output> processmap = new HashMap<Integer, Output>();
		//Map<Integer, Integer> parentChildMap = new HashMap<Integer, Integer>();
		List<Output> outputList = null;
		for (Data data : dbList) {
			// storing item
			Integer parentid = data.getParentId();
			//parentChildMap.put(data.getId(), parentid);
			String name = data.getName();
			Output item = processmap.get(data.getId());
			if (item == null) {
				item = new Output(name);
				processmap.put(data.getId(), item);
			} else
				item.setName(name);

			// storing parent
			if (!processmap.containsKey(parentid))
				processmap.put(parentid, new Output(""));
			processmap.get(parentid).subClass.add(item);
		}

		outputList = new ArrayList<Output>();
		for (Entry<Integer, Output> mapEntry : processmap.entrySet()) {

			Integer key = mapEntry.getKey();
			//Integer parentId = parentChildMap.get(key);
			if (key == 0)
				outputList.add(mapEntry.getValue());

		}
		Iterable iterable = outputList;
		return iterable;

	}

}