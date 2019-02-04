package calllog

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PhoneServiceSpec extends Specification {

    PhoneService phoneService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Phone(...).save(flush: true, failOnError: true)
        //new Phone(...).save(flush: true, failOnError: true)
        //Phone phone = new Phone(...).save(flush: true, failOnError: true)
        //new Phone(...).save(flush: true, failOnError: true)
        //new Phone(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //phone.id
    }

    void "test get"() {
        setupData()

        expect:
        phoneService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Phone> phoneList = phoneService.list(max: 2, offset: 2)

        then:
        phoneList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        phoneService.count() == 5
    }

    void "test delete"() {
        Long phoneId = setupData()

        expect:
        phoneService.count() == 5

        when:
        phoneService.delete(phoneId)
        sessionFactory.currentSession.flush()

        then:
        phoneService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Phone phone = new Phone()
        phoneService.save(phone)

        then:
        phone.id != null
    }
}
