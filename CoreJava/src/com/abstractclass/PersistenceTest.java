package com.abstractclass;
abstract class Persistence
{
	abstract void persist();
}
class FilePersistence extends Persistence
{
	public void persist()
	{
	 System.out.println("Data persisted into file" ) ;
	}
}
class DatabasePersistence extends Persistence
{
	public void persist()
	{
	 System.out.println("Data persisted into database" ) ;
	}
}
class PersistenceFactory{
	public static Persistence getPersistence()
	{
		return new DatabasePersistence();
	}
}
class PersistenceTest
{
public static void main(String args[])
	{
		Persistence  p=PersistenceFactory.getPersistence();
		p.persist();
	}
	
}