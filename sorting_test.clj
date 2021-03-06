(defrecord User [id name])

(def users
  [(->User 3 "A")
   (->User 1 "B")
   (->User 2 "C")])
(println "users:" users)

(def sorted-users1
  (sort (fn [x y] (compare (:id x) (:id y))) users))
(println "sorted-users1:" sorted-users1)

(def sorted-users2
  (sort #(compare (:id %1) (:id %2)) users))
(println "sorted-users2:" sorted-users2)

(def sorted-users3
  (sort-by (fn [x] (:id x)) users))
(println "sorted-users3:" sorted-users3)

(def sorted-users4
  (sort-by #(:id %) users))
(println "sorted-users4:" sorted-users4)

(def sorted-users5
  (sort-by :id users))
(println "sorted-users5:" sorted-users5)
