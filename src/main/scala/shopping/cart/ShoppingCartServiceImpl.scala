package shopping.cart

import org.slf4j.LoggerFactory

import scala.concurrent.Future

class ShoppingCartServiceImpl extends proto.ShoppingCartService {

    private val logger = LoggerFactory.getLogger(getClass)

    override def addItem(in: proto.AddItemRequest): Future[proto.Cart] = {
      logger.info("addItem {} to cart {}", in.itemId, in.cartId)
      Future.successful(
        proto.Cart(items = List(proto.Item(in.itemId, in.quantity))))
    }


}
