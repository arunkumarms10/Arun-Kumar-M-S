package jbr.springmvc.service;


import java.util.List;

import jbr.springmvc.model.Counter;


public interface ContactService {
                
                public String findCounter(String counter);

                public void findCounter(Counter counter);

    
}