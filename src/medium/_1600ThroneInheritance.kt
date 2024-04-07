package medium

class _1600ThroneInheritance {
    class ThroneInheritance(private val kingName: String) {

        private val edges = HashMap<String, ArrayList<String>>()
        private val dead = mutableSetOf<String>()

        fun birth(parentName: String, childName: String) {
            val children = edges.getOrDefault(parentName, arrayListOf())
            children.add(childName)
            edges[parentName] = children
        }

        fun death(name: String) {
            dead.add(name)
        }

        fun getInheritanceOrder(): List<String> {
            val list = arrayListOf<String>()
            preorder(list, kingName)
            return list
        }

        private fun preorder(list: ArrayList<String>, name: String) {
            if (!dead.contains(name)) {
                list.add(name)
            }
            val children = edges.getOrDefault(name, arrayListOf())
            for (child in children) {
                preorder(list, child)
            }
        }
    }
}