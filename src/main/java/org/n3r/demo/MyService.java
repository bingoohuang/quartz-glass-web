package org.n3r.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void pringMe() {
        System.out.println(MyService.class);
    }
}
