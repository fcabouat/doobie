package doobie.std

import doobie.free.preparedstatement.setLong
import doobie.free.resultset.getLong
import doobie.util.atom.Atom
import doobie.enum.jdbctype

object long {

  implicit val LongAtom: Atom[Long] = 
    Atom.atom(jdbctype.BigInt, setLong, getLong)

}