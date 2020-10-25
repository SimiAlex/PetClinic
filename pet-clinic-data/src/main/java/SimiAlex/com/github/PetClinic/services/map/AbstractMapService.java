package SimiAlex.com.github.PetClinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import SimiAlex.com.github.PetClinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity> 
{
    // fields
    protected Map<Long , T > map = new HashMap<>();

    // methods
    Set<T> findAll()
    {
      return new HashSet<>(map.values());   
    }

    T findById(Long id)
    {
        return map.get(id);
    }

    T save(T o)
    {
        if(o != null)
        {
            if(o.getId() == null)
            {
                o.setId(getNextId());
            }
            map.put(o.getId(), o);
        }else{
            throw new RuntimeException("Object cannot be nulll");
        }   
            return o;
    }

    void delete(T object)
    {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(Long id)
    {
        map.remove(id);
    }
    
    private Long getNextId()
    {
        Long nextId = null;

        try{
            nextId = Collections.max(map.keySet()) +1;
        }
        catch(NoSuchElementException e)
        {
            nextId = 1L;
        }
        return nextId;
    }
}
