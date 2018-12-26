## Revision

In `DemoServiceImpl.java`, method `remove()` on the book:

```java
    @Override
    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.println("删除了id、key为: " + id + "的数据缓存");
        personRepository.deleteById(id);
    }
```
`@CacheEvict(value = "people")` will delete the cache from the `people`

`personRepository.deleteById(id);`will delete the data from the database.that's not right.

So delete last line.

```java
    @Override
    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.println("删除了id、key为: " + id + "的数据缓存");
    }
```

---

In `DemoServiceImpl.java`, method `findOne()` on the book:

```java
    @Override
    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("为id、key为： " + p.getId() + "数据做了缓存");
        return p;
    }
```

But there has been some changes with the recent versions of spring data jpa and they have removed the findOne() method which used work earlier.

So use `findById()` instead of `findOne()`
```java
    @Override
    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findById(person.getId()).get();
        System.out.println("为id、key为： " + p.getId() + "数据做了缓存");
        return p;
    }
```

---