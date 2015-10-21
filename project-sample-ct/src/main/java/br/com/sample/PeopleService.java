package br.com.sample;

import br.com.sample.output.People;

public interface PeopleService {

	public People getPeople(String name);

	public String update(String name);

	public String insert(String name);

	public String delete(String name);
}
