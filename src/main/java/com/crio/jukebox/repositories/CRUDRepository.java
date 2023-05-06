package com.crio.jukebox.repositories;

import java.util.List;
import java.util.Optional;

public interface CRUDRepository<T,ID> {
    public T save(T entity);
    public Optional<T> findById(ID id);
    public void deleteById(ID id);
}
