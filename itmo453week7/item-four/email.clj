(ns examplecom.etc.email
(:require [riemann.email :refer :all]))

(def email (mailer {:host "smtp.gmail.com"
                    :user "ascartoz@hawk.iit.edu"
                    :pass "**********"
                    :tls  true
                    :port 587
                    :from "ascartoz@hawk.iit.edu"}))