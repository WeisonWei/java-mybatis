package org.mb.service;

import org.mb.domain.User;

public interface UserService {
    User getById(Integer id);

    int insert(Integer id);

    int delete(Integer id);
}
