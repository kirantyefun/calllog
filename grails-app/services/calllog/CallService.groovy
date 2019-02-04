package calllog

import grails.gorm.services.Service

@Service(Call)
interface CallService {

    Call get(Serializable id)

    List<Call> list(Map args)

    Long count()

    void delete(Serializable id)

    Call save(Call call)

}