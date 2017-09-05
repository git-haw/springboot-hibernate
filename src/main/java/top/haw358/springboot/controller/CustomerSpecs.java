package top.haw358.springboot.controller;

import org.springframework.data.jpa.domain.Specification;
import top.haw358.springboot.pojo.User;

import javax.persistence.criteria.*;

/**
 * Created by haw on 17-9-1.
 */
public class CustomerSpecs {

    public static Specification<User> get(){
        return new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.and();
            }
        };
    }

}
