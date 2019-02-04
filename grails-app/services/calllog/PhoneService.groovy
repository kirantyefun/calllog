package calllog

import grails.gorm.services.Service

@Service(Phone)
interface PhoneService {

    Phone get(Serializable id)

    List<Phone> list(Map args)

    Long count()

    void delete(Serializable id)

    Phone save(Phone phone)

}