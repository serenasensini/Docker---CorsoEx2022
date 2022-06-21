FROM registry.access.redhat.com/ubi8/python-38

USER 0
ADD ./ .
RUN chown -R 1001:0 ./
USER 1001

RUN pip install -U "pip>=19.3.1" && \
    pip install -r requirements.txt && \
    python manage.py migrate && \
    npm i && \
    gulp watch

CMD python manage.py runserver