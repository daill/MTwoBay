package de.daill.services.magento

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.*


@Entity
@Table(name = "magento_settings")
open class MagentoProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    open var consumerKey = ""
    open var consumerSecret = ""
    open var token = ""
    open var tokenSecret = ""
    open var verifier = ""
    open var storeBaseUrl = ""
    open var callbackUrl = ""


}